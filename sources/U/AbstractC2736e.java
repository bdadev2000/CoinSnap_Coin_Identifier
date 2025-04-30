package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import c.C0578b;
import c.InterfaceC0580d;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2736e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0580d f23040a;
    public final ComponentName b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23041c;

    public AbstractC2736e(InterfaceC0580d interfaceC0580d, ComponentName componentName, Context context) {
        this.f23040a = interfaceC0580d;
        this.b = componentName;
        this.f23041c = context;
    }

    public static void a(Context context, String str, AbstractServiceConnectionC2741j abstractServiceConnectionC2741j) {
        abstractServiceConnectionC2741j.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, abstractServiceConnectionC2741j, 33);
    }

    public final C2744m b(C2732a c2732a) {
        BinderC2735d binderC2735d = new BinderC2735d(c2732a);
        InterfaceC0580d interfaceC0580d = this.f23040a;
        try {
            if (!((C0578b) interfaceC0580d).d(binderC2735d)) {
                return null;
            }
            return new C2744m(interfaceC0580d, binderC2735d, this.b);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
