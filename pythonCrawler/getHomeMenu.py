# 爬取下厨房的菜谱
import requests
from bs4 import BeautifulSoup
import time
import pandas

headers = {
    'accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
    'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36'
}

titles = []
links = []
ellipsis_list = []
authors = []

for num in range(1, 11):
    urlHome = 'https://www.xiachufang.com/category/40076/?page=' + str(num)

    resHome = requests.get(urlHome, headers=headers)

    bs = BeautifulSoup(resHome.text, 'html.parser')

    # 定位最小父级标签ul，返回一个Tag对象
    parent = bs.find('div', class_='category-recipe-list').find('div', class_='normal-recipe-list') \
        .find('ul', class_='list')

    # 获取ul标签下的所有li标签，返回一个迭代器
    lis = parent.find_all('li')

    # 利用for循环遍历每个li标签，再向下精准提取数据
    for item in lis:
        # 获取标题
        title = item.find('div', class_='recipe').find('div', class_='info').find('p', class_='name').find(
            'a').text.strip()
        titles.append(title)
        # 获取标题链接
        link = 'http://www.xiachufang.com' + \
               item.find('div', class_='recipe').find('div', class_='info').find('p', class_='name').find('a')['href']
        links.append(link)
        # 获取配料
        ellipsis = item.find('div', class_='recipe').find('div', class_='info').find('p',
                                                                                     class_='ing ellipsis').text.strip()
        ellipsis_list.append(ellipsis)
        # 获取发布该信息的作者
        author = item.find('div', class_='recipe').find('div', class_='info').find('p', class_='author').text.replace(
            '\n', '')
        authors.append(author)

    time.sleep(2)

content = {'标题': titles, '链接': links, '配料': ellipsis_list, '发布作者': authors}
df = pandas.DataFrame(content)
df.to_excel('XiaChuFangHomeMenu.xlsx')
