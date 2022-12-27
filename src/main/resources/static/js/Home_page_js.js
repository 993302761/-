window.onload= function () {


    var chartDom = document.getElementById('pm');
    var myChart = echarts.init(chartDom);
    var option;

    option = {
        title: {
            text: '流量表'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['天津分区', '北京分区', '长沙分区','总计']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name: '天津分区',
                type: 'line',
                stack: '总量',
                data: [120, 132, 101, 230, 125, 321, 235, 236, 286, 199, 300, 310]
            },
            {
                name: '北京分区',
                type: 'line',
                stack: '总量',
                data: [220, 182, 191, 101, 255, 201, 158,199, 132, 101, 230, 205]
            },
            {
                name: '长沙分区',
                type: 'line',
                stack: '总量',
                data: [235, 205, 200, 152, 101, 250, 320, 186, 191, 101, 255, 201]
            },
            {
                name: '总计',
                type: 'line',
                stack: '总量',
                data: [420, 350, 300, 389, 432, 354, 452, 364, 382, 420, 410, 299]
            }
        ]
    };

    myChart.setOption(option);
}


