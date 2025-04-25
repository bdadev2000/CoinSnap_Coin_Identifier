package com.glority.base.widget.webview;

import kotlin.Metadata;

/* compiled from: Jsb.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"jsb", "", "base_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class JsbKt {
    public static final String jsb = "\nclass jsb {\n  constructor() {\n      this.invokeId = 0;\n      this.callbackMap = {};\n  }\n\n  invoke(method_name, params = {}, callback) {\n    this.invokeId++;\n    if (callback) {\n      this.callbackMap[this.invokeId.toString()] = callback;\n    }\n    window.messageHandlers.postMessage(JSON.stringify({method: method_name, params: params, invokeId: this.invokeId}));\n  }\n\n  onResponse(responseBody, invokeId) {\n    console.log(\"onResponse: \" + responseBody);\n    var callback = this.callbackMap[invokeId.toString()];\n    if (callback) {\n      callback(responseBody)\n    }\n  }\n}\n\nwindow.__jsb = new jsb();\n";
}
