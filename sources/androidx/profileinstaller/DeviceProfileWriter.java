package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
public class DeviceProfileWriter {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20872a;

    /* renamed from: b, reason: collision with root package name */
    public final ProfileInstaller.DiagnosticsCallback f20873b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20874c;
    public final File d;
    public final String e;

    /* renamed from: h, reason: collision with root package name */
    public DexProfileData[] f20877h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f20878i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20876g = false;

    /* renamed from: f, reason: collision with root package name */
    public final String f20875f = "dexopt/baseline.profm";

    public DeviceProfileWriter(AssetManager assetManager, androidx.arch.core.executor.a aVar, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        this.f20872a = aVar;
        this.f20873b = diagnosticsCallback;
        this.e = str;
        this.d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 26:
                    bArr = ProfileVersion.d;
                    break;
                case 27:
                    bArr = ProfileVersion.f20903c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ProfileVersion.f20902b;
                    break;
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                    bArr = ProfileVersion.f20901a;
                    break;
            }
        }
        this.f20874c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f20873b.a();
            }
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f20872a.execute(new a(i2, this, serializable, 0));
    }
}
