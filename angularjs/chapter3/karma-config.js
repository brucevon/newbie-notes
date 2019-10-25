// karma config
module.exports = function (config) {
    config.set({
        // 放置文件的根目录
        basePath: '',

        // 使用哪些测试框架
        frameworks: ['jasmine'],

        // 浏览器需要加载的文件列表或者文件匹配表达式
        files: [
            'angular.min.js',
            'angular-mock.js',
            'controller.js',
            'simpleSpec.js',
            'controllerSpec.js'
        ],

        // 需要排除的文件列表或者文件匹配正则表达式
        exclude: [],

        // web服务器端口
        port: 8080,

        // 日志等级
        // 合法值为：LOG_DISABLE || LOG_ERROR || LOG_WARN || LOG_INFO || LOG_DEBUG
        logLevel: config.LOG_INFO,

        // 进行测试时是否允许随时监测文件变化
        autoWatch: true,

        // 启动以下浏览器，目前兼容：
        // - Chrome
        // - ChromeCanary
        // - Firefox
        // - Opera
        // - Safari
        // - PhantomJS
        // - IE
        browser: ['Chrome'],

        // 持续集成模式
        // 如果设置成true，则会启动浏览器，运行测试然后退出
        singleRun: false
    });
};