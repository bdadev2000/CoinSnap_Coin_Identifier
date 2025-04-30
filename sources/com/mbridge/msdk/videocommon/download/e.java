package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f19450a;

    /* renamed from: com.mbridge.msdk.videocommon.download.e$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f19451a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.f19451a.f19450a);
        }
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static e f19452a = new e(null);
    }

    public /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        this();
    }

    public final String b(String str) {
        try {
            File file = new File(this.f19450a + "/" + SameMD5.getMD5(ao.b(str)) + ".html");
            if (file.exists()) {
                return ab.b(file);
            }
            return null;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
                return null;
            }
            return null;
        }
    }

    private e() {
        this.f19450a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
    }

    public static e a() {
        return a.f19452a;
    }

    public final String a(String str) {
        try {
            String str2 = this.f19450a + "/" + SameMD5.getMD5(ao.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.c.g b = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b != null && !TextUtils.isEmpty(b.T())) {
                com.mbridge.msdk.foundation.same.d.a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
