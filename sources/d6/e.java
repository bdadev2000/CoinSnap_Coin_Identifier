package d6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16877d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f16878e;

    /* renamed from: f, reason: collision with root package name */
    public File f16879f;

    /* renamed from: g, reason: collision with root package name */
    public b f16880g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f16881h;

    public e(String useCase, String assetUri, String str, int i10, float[] fArr) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        this.a = useCase;
        this.f16875b = assetUri;
        this.f16876c = str;
        this.f16877d = i10;
        this.f16878e = fArr;
    }
}
