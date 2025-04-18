package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f6679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6680c;

    public /* synthetic */ c(IntConsumer intConsumer, int i2, int i3) {
        this.f6678a = i3;
        this.f6679b = intConsumer;
        this.f6680c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f6678a;
        int i3 = this.f6680c;
        IntConsumer intConsumer = this.f6679b;
        switch (i2) {
            case 0:
                intConsumer.accept(i3);
                return;
            default:
                intConsumer.accept(i3);
                return;
        }
    }
}
