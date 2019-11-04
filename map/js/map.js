// 获取地图容器
var main = document.getElementById('main');
// 基于准备好的dom，初始化echarts实例
var mapChart = echarts.init(main);

// 兴义市
loadMap('xingyi', '兴义市');

// 地图下钻
mapChart.on('click', function (params) {
    var name = params.name;
    if (name != '兴义市') {
        switch (name) {
            case '威舍镇'       :
                loadMap('weishe', '威舍镇');
                break;
            case '万屯镇'       :
                loadMap('wantun', '万屯镇');
                break;
            case '马岭镇'       :
                loadMap('maling', '马岭镇');
                break;
            case '鲁屯镇'       :
                loadMap('lutun', '鲁屯镇');
                break;
            case '顶效镇'       :
                loadMap('dingxiao', '顶效镇');
                break;
            case '郑屯镇'       :
                loadMap('zhengtun', '郑屯镇');
                break;
            case '乌沙镇'       :
                loadMap('wusha', '乌沙镇');
                break;
            case '白碗窑镇'     :
                loadMap('baiwanyao', '白碗窑镇');
                break;
            case '七舍镇'       :
                loadMap('qishe', '七舍镇');
                break;
            case '敬南镇'       :
                loadMap('jingnan', '敬南镇');
                break;
            case '则戎乡'       :
                loadMap('zerong', '则戎乡');
                break;
            case '雄武乡'       :
                loadMap('xiongwu', '雄武乡');
                break;
            case '南盘江镇'     :
                loadMap('nanpanjiang', '南盘江镇');
                break;
            case '猪场坪乡'     :
                loadMap('zhuchangping', '猪场坪乡');
                break;
            case '捧乍镇'       :
                loadMap('pengzha', '捧乍镇');
                break;
            case '鲁布格镇'     :
                loadMap('lubuge', '鲁布格镇');
                break;
            case '泥凼镇'       :
                loadMap('nidang', '泥凼镇');
                break;
            case '三江口镇'     :
                loadMap('sanjiangkou', '三江口镇');
                break;
            case '仓更镇'       :
                loadMap('canggeng', '仓更镇');
                break;
            case '沧江乡'       :
                loadMap('cangjiang', '沧江乡');
                break;
            case '洛万乡'       :
                loadMap('luowan', '洛万乡');
                break;
            case '清水河镇'     :
                loadMap('qingshuihe', '清水河镇');
                break;
            case '坪东街道'     :
                loadMap('pingdong', '坪东街道');
                break;
            case '木贾街道'     :
                loadMap('mujia', '木贾街道');
                break;
            case '丰都街道'     :
                loadMap('fengdu', '丰都街道');
                break;
            case '桔山街道'     :
                loadMap('jushan', '桔山街道');
                break;
            case '万峰林街道'   :
                loadMap('wanfenglin', '万峰林街道');
                break;
            case '下五屯街道'   :
                loadMap('xiawutun', '下五屯街道');
                break;
            case '兴泰街道'     :
                loadMap('xingtai', '兴泰街道');
                break;
            case '黄草街道'     :
                loadMap('huangcao', '黄草街道');
                break;
            default:
                alert("Get Map Data Error!");
        }
    }
});

// 屏蔽浏览器右键
document.oncontextmenu = function () {
    return false;
};
// 地图上钻
main.oncontextmenu = function (params) {
    if (params.name != '兴义市') {
        loadMap('xingyi', '兴义市');
    }
};

// 加载地图
function loadMap(area, name) {
    $.get('geo/' + area + '.json', function (map) {
        mapChart.hideLoading();

        // 注册可用的地图，必须在包括 geo 组件或者 map 图表类型的时候才能使用
        echarts.registerMap('map', map);
        var mapOption = {
            // 提示框组件
            tooltip: {
                // 提示框浮层内容格式器
                formatter: '{b0}'
            },
            series: [
                {
                    // 地理区域数据的可视化
                    type: 'map',
                    // 系列名称，用于tooltip的显示，legend 的图例筛选，在 setOption 更新数据和配置项时用于指定对应的系列
                    name: name,
                    // 地图类型
                    map: 'map',
                    // 鼠标平移缩放
                    // roam: true,
                    // 图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等
                    label: {
                        // show: true
                    },
                    // 地图区域的多边形 图形样式
                    itemStyle: {
                        // 图形的颜色
                        areaColor: '#1a6eff',
                        // 图像描边颜色
                        borderColor: '#ffffff'
                    },
                    // 高亮状态下的多边形和标签样式
                    emphasis: {
                        label: {
                            show: true
                        },
                        itemStyle: {
                            areaColor: '#ffd985'
                        }
                    }
                }
            ]
        }

        mapChart.setOption(mapOption);
    });
}



