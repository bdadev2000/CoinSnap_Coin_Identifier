package G6;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1301a;

    static {
        int[] iArr = new int[ArCoreApk.InstallStatus.values().length];
        try {
            iArr[ArCoreApk.InstallStatus.INSTALLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ArCoreApk.InstallStatus.INSTALL_REQUESTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1301a = iArr;
    }
}
