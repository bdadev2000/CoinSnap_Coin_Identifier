package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import d0.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
public final class ViewModelLazy<VM extends ViewModel> implements h {

    /* renamed from: a, reason: collision with root package name */
    public final x0.c f20121a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f20122b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.a f20123c;
    public final q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public ViewModel f20124f;

    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {
        @Override // q0.a
        public final Object invoke() {
            return CreationExtras.Empty.f20236b;
        }
    }

    public ViewModelLazy(j jVar, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        this.f20121a = jVar;
        this.f20122b = aVar;
        this.f20123c = aVar2;
        this.d = aVar3;
    }

    @Override // d0.h
    public final Object getValue() {
        ViewModel viewModel = this.f20124f;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.f20122b.invoke();
        ViewModelProvider.Factory factory = (ViewModelProvider.Factory) this.f20123c.invoke();
        CreationExtras creationExtras = (CreationExtras) this.d.invoke();
        p0.a.s(viewModelStore, "store");
        p0.a.s(factory, "factory");
        p0.a.s(creationExtras, "extras");
        ViewModel c2 = new ViewModelProvider(viewModelStore, factory, creationExtras).c(this.f20121a);
        this.f20124f = c2;
        return c2;
    }
}
