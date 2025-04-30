package C0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f389a;
    public final d b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f390c;

    /* renamed from: d, reason: collision with root package name */
    public final File f391d;

    /* renamed from: e, reason: collision with root package name */
    public final String f392e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f393f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f394g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f395h;

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f389a = executor;
        this.b = dVar;
        this.f392e = str;
        this.f391d = file;
        int i9 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i9 <= 34) {
            switch (i9) {
                case 24:
                case 25:
                    bArr = e.f410h;
                    break;
                case 26:
                    bArr = e.f409g;
                    break;
                case 27:
                    bArr = e.f408f;
                    break;
                case 28:
                case 29:
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    bArr = e.f407e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f406d;
                    break;
            }
        }
        this.f390c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.g();
            }
            return null;
        }
    }

    public final void b(int i9, Serializable serializable) {
        this.f389a.execute(new a(i9, this, serializable, 0));
    }
}
