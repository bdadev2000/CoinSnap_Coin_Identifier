package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class w extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f17254a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;

    /* renamed from: c, reason: collision with root package name */
    private final l f17255c;

    public w(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, l lVar) {
        this.f17254a = bVar;
        this.b = aVar;
        this.f17255c = lVar;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i9, x xVar) {
        CampaignEx g9 = this.b.g();
        if (TextUtils.isEmpty(g9.getMraid())) {
            xVar.b(this.f17254a, this.b, this);
            return;
        }
        String a6 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(g9.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(a6, md5.concat(".html"));
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(("<script>" + com.mbridge.msdk.c.b.a.a().b() + "</script>" + g9.getMraid()).getBytes());
                    fileOutputStream2.flush();
                    g9.setMraid(file.getAbsolutePath());
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    g9.setMraid("");
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    xVar.b(this.f17254a, this.b, this);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            }
            xVar.b(this.f17254a, this.b, this);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
