package com.smponi.intellij.faultscope

import com.intellij.openapi.Disposable

/**
 * Gets automatically disposed when the plugin is unloaded.
 */
class InspectionLensPluginDisposableService : Disposable {
	override fun dispose() {
		//do nothing
	}
}
