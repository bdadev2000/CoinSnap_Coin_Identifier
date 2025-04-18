package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class w extends q {
    private final com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f14627b;

    /* renamed from: c, reason: collision with root package name */
    private final l f14628c;

    public w(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, l lVar) {
        this.a = bVar;
        this.f14627b = aVar;
        this.f14628c = lVar;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i10, x xVar) {
        CampaignEx g10 = this.f14627b.g();
        if (TextUtils.isEmpty(g10.getMraid())) {
            xVar.b(this.a, this.f14627b, this);
            return;
        }
        String a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(g10.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(a, md5.concat(".html"));
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(("<script>" + com.mbridge.msdk.c.b.a.a().b() + "</script>" + g10.getMraid()).getBytes());
                    fileOutputStream2.flush();
                    g10.setMraid(file.getAbsolutePath());
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    g10.setMraid("");
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    xVar.b(this.a, this.f14627b, this);
                } catch (Throwable th2) {
                    th = th2;
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
            xVar.b(this.a, this.f14627b, this);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
