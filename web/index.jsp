<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Live2D 看板娘 v1.4 / Demo 1</title>
    <link rel="stylesheet" type="text/css" href="assets/waifu.css"/>
</head>

<body style="font-family: 'Microsoft YaHei';">


<script src="https://cdn.jsdelivr.net/npm/jquery@3.3.1/dist/jquery.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/jquery-ui-dist@1.12.1/jquery-ui.min.js"></script>

<div class="waifu">
    <div class="waifu-tips"></div>
    <canvas id="live2d" class="live2d"></canvas>
    <div class="waifu-tool">
        <span class="fui-home"></span>
        <span class="fui-chat"></span>
        <span class="fui-eye"></span>
        <span class="fui-user"></span>
        <span class="fui-photo"></span>
        <span class="fui-info-circle"></span>
        <span class="fui-cross"></span>
    </div>
</div>

<script src="assets/waifu-tips.js"></script>
<script src="assets/live2d.js"></script>
<script type="text/javascript">
    /* 可直接修改部分参数 */
    live2d_settings['modelId'] = 4; // 默认模型 ID
    live2d_settings['modelTexturesId'] = 87; // 默认材质 ID
    live2d_settings['modelStorage'] = false; // 不储存模型 ID
    live2d_settings['canCloseLive2d'] = false; // 隐藏 关闭看板娘 按钮
    live2d_settings['canTurnToHomePage'] = false; // 隐藏 返回首页 按钮
    live2d_settings['waifuSize'] = '600x535'; // 看板娘大小
    live2d_settings['waifuTipsSize'] = '570x150'; // 提示框大小
    live2d_settings['waifuFontSize'] = '30px'; // 提示框字体
    live2d_settings['waifuToolFont'] = '36px'; // 工具栏字体
    live2d_settings['waifuToolLine'] = '50px'; // 工具栏行高
    live2d_settings['waifuToolTop'] = '-60px'; // 工具栏顶部边距
    live2d_settings['waifuDraggable'] = 'axis-x'; // 拖拽样式
    /* 在 initModel 前添加 */
    initModel("assets/waifu-tips.json")
</script>
</body>
</html>
