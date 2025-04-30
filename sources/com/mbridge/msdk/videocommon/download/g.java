package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import c7.C0665z;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f19453a = "ResourceManager";
    private String b;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f19454a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.f19454a.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static g f19455a = new g(null);
    }

    public /* synthetic */ g(AnonymousClass1 anonymousClass1) {
        this();
    }

    private g() {
        this.b = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
    }

    public static g a() {
        return a.f19455a;
    }

    public final String a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.b + "/" + SameMD5.getMD5(ao.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!ab.d(str6)) {
                return null;
            }
            try {
                com.mbridge.msdk.c.g b = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b != null && !TextUtils.isEmpty(b.T())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str6));
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return C0665z.FILE_SCHEME + str6 + str3;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e4.printStackTrace();
            return null;
        }
    }
}
