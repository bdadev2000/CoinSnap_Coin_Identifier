package androidx.compose.ui.platform;

/* loaded from: classes2.dex */
public interface InfiniteAnimationPolicy extends h0.j {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes2.dex */
    public static final class Key implements h0.k {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Key f16514a = new Object();
    }

    Object Y();

    @Override // h0.j
    default h0.k getKey() {
        return Key.f16514a;
    }
}
