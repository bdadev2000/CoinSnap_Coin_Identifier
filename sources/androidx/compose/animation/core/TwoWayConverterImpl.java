package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import q0.l;

/* loaded from: classes3.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final l f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2339b;

    public TwoWayConverterImpl(l lVar, l lVar2) {
        this.f2338a = lVar;
        this.f2339b = lVar2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final l a() {
        return this.f2338a;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final l b() {
        return this.f2339b;
    }
}
