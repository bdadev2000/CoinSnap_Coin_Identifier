package androidx.compose.runtime;

import com.google.zxing.pdf417.PDF417Common;
import h0.g;
import j0.c;
import j0.e;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {921, PDF417Common.MAX_CODEWORDS_IN_BARCODE}, m = "runFrameLoop")
/* loaded from: classes4.dex */
public final class Recomposer$runFrameLoop$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Recomposer f13922a;

    /* renamed from: b, reason: collision with root package name */
    public MonotonicFrameClock f13923b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13924c;
    public List d;

    /* renamed from: f, reason: collision with root package name */
    public List f13925f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13927h;

    /* renamed from: i, reason: collision with root package name */
    public int f13928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$1(Recomposer recomposer, g gVar) {
        super(gVar);
        this.f13927h = recomposer;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f13926g = obj;
        this.f13928i |= Integer.MIN_VALUE;
        return Recomposer.z(this.f13927h, null, null, this);
    }
}
