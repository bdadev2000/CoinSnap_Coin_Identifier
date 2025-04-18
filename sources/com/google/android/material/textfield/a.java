package com.google.android.material.textfield;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28731b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f28730a = i2;
        this.f28731b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28730a;
        Object obj = this.f28731b;
        switch (i2) {
            case 0:
                ClearTextEndIconDelegate.e((ClearTextEndIconDelegate) obj);
                return;
            case 1:
                DropdownMenuEndIconDelegate.f((DropdownMenuEndIconDelegate) obj);
                return;
            default:
                TextInputLayout.a((TextInputLayout) obj);
                return;
        }
    }
}
