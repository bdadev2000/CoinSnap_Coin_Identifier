package f;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20213c;

    public /* synthetic */ d(l lVar, int i9) {
        this.b = i9;
        this.f20213c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                l lVar = this.f20213c;
                G7.j.e(lVar, "this$0");
                lVar.invalidateMenu();
                return;
            default:
                l lVar2 = this.f20213c;
                G7.j.e(lVar2, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (G7.j.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e4;
                    }
                } catch (NullPointerException e9) {
                    if (!G7.j.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e9;
                    }
                    return;
                }
        }
    }
}
