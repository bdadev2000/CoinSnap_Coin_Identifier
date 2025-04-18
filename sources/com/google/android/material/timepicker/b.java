package com.google.android.material.timepicker;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28743b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28742a = i2;
        this.f28743b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28742a;
        Object obj = this.f28743b;
        switch (i2) {
            case 0:
                ((RadialViewGroup) obj).updateLayoutParams();
                return;
            default:
                MaterialTimePicker.h((MaterialTimePicker) obj);
                return;
        }
    }
}
