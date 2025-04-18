package com.google.firebase.components;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28822b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f28821a = i2;
        this.f28822b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$1;
        Object lambda$intoSet$3;
        Object lambda$intoSet$4;
        Object lambda$of$2;
        Object lambda$of$0;
        int i2 = this.f28821a;
        Object obj = this.f28822b;
        switch (i2) {
            case 0:
                lambda$of$1 = Component.lambda$of$1(obj, componentContainer);
                return lambda$of$1;
            case 1:
                lambda$intoSet$3 = Component.lambda$intoSet$3(obj, componentContainer);
                return lambda$intoSet$3;
            case 2:
                lambda$intoSet$4 = Component.lambda$intoSet$4(obj, componentContainer);
                return lambda$intoSet$4;
            case 3:
                lambda$of$2 = Component.lambda$of$2(obj, componentContainer);
                return lambda$of$2;
            default:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
        }
    }
}
