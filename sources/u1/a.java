package u1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import o.q;
import v8.u0;

/* loaded from: classes.dex */
public final class a {
    public final Executor a;

    /* renamed from: b, reason: collision with root package name */
    public final c f25417b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25418c;

    /* renamed from: d, reason: collision with root package name */
    public final File f25419d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25421f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f25422g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f25423h;

    public a(AssetManager assetManager, l.a aVar, c cVar, String str, File file) {
        byte[] bArr;
        this.a = aVar;
        this.f25417b = cVar;
        this.f25420e = str;
        this.f25419d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = u0.f26313s;
                    break;
                case 26:
                    bArr = u0.f26312r;
                    break;
                case 27:
                    bArr = u0.f26311q;
                    break;
                case 28:
                case NOTIFICATION_REDIRECT_VALUE:
                case 30:
                    bArr = u0.f26310p;
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                case 32:
                case 33:
                    bArr = u0.f26309o;
                    break;
            }
            this.f25418c = bArr;
        }
        bArr = null;
        this.f25418c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f25417b.e();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.a.execute(new q(this, i10, serializable, 1));
    }
}
