package com.mbridge.msdk.out;

/* loaded from: classes3.dex */
public interface WebLoadListener {
    void onFailed(String str, int i9, int i10, int i11, String str2, String str3);

    void onProgress(String str, int i9, int i10, int i11, String str2, String str3);

    void onSucess(String str, int i9, int i10, int i11, String str2, String str3);
}
