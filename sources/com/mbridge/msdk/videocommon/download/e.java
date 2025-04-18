package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;

/* loaded from: classes4.dex */
public final class e {
    private String a;

    /* renamed from: com.mbridge.msdk.videocommon.download.e$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {
        final /* synthetic */ e a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.a.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static e a = new e(null);
    }

    public /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        this();
    }

    public final String b(String str) {
        try {
            File file = new File(this.a + "/" + SameMD5.getMD5(ao.b(str)) + ".html");
            if (file.exists()) {
                return ab.b(file);
            }
            return null;
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
                return null;
            }
            return null;
        }
    }

    private e() {
        this.a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
    }

    public static e a() {
        return a.a;
    }

    public final String a(String str) {
        try {
            String str2 = this.a + "/" + SameMD5.getMD5(ao.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 != null && !TextUtils.isEmpty(b3.T())) {
                com.mbridge.msdk.foundation.same.d.a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
