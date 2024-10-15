# Android view截图程序

该项目提供了一个简单的实用程序，用于捕获 Android 应用程序中view的屏幕截图，在对话框中显示它们，并允许用户共享或将图像保存到他们的图库中。

## 功能

- 捕获任何视图的屏幕截图。
- 在对话框中显示捕获的图像，并提供共享或保存选项。
- 使用自定义文件名将图像保存在设备的图库中。
- 使用任何已安装的共享应用共享图像。

## 要求

- Android SDK 21 (Lollipop) 及以上版本
- Kotlin 支持

## 用法

要使用屏幕截图实用程序，请按照以下步骤操作：

1. **ScreenshotUtils.kt添加到您的项目：**
``` kotlin
复制ScreenshotUtils.kt 到你的项目中
```

2. **将实用程序类添加到您的项目：**

创建一个名为“ScreenshotUtils.kt”的新 Kotlin 文件并复制以下代码：
``` kotlin
 var saveButton: Button = findViewById(R.id.save_button2)
        var scrollView1: LinearLayout = findViewById(R.id.scrollView1)  // 需要保存为图片view
        var scrollView2: LinearLayout = findViewById(R.id.scrollView2)  // 需要保存为图片view

        saveButton.setOnClickListener {
            ScreenshotUtils.captureAndShowScreenshot(this, scrollView1, scrollView2,fileName="文件名")
```
## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=afterow/uex&type=Date)](https://star-history.com/#afterow/uex&Date)
