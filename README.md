This project is a fork of <a href="https://github.com/chylex/IntelliJ-Inspection-Lens">Inspection Lens</a> that means,
most of the credit goes to the original author <a href="https://chylex.com/">chylex</a>. I just wanted to add a few features that I needed.

IntelliJ plugin that shows errors, warnings, and other inspection highlights inline.

Simply install the plugin and inspection descriptions will appear on the right side of the lines. Shown inspection severities are **Errors**, **Warnings**, **Weak Warnings**, **Server Problems**, **Typos**, and other inspections from plugins or future IntelliJ versions that have a high enough severity level. Each severity has a different color, with support for both light and dark themes.

The plugin is not customizable outside of the ability to disable/enable the plugin without restarting the IDE. If the defaults don't work for you, I would recommend proposing your change in the issue tracker.

Inspired by [Error Lens](https://marketplace.visualstudio.com/items?itemName=usernamehw.errorlens) for Visual Studio Code, and [Inline Error](https://plugins.jetbrains.com/plugin/17302-inlineerror) for IntelliJ Platform.

![Inspection Lens Screenshot](https://raw.githubusercontent.com/chylex/IntelliJ-Inspection-Lens/main/.github/readme/intellij.png)
