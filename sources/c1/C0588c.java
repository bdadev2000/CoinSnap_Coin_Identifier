package c1;

import V0.k;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.o;
import d1.C2168i;
import e1.j;
import g1.InterfaceC2286a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x0.AbstractC2914a;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588c implements Z0.b, V0.a {
    public static final String m = o.g("SystemFgDispatcher");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final k f5377c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2286a f5378d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5379f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public String f5380g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f5381h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5382i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f5383j;

    /* renamed from: k, reason: collision with root package name */
    public final Z0.c f5384k;
    public InterfaceC0587b l;

    public C0588c(Context context) {
        this.b = context;
        k v6 = k.v(context);
        this.f5377c = v6;
        InterfaceC2286a interfaceC2286a = v6.f3419d;
        this.f5378d = interfaceC2286a;
        this.f5380g = null;
        this.f5381h = new LinkedHashMap();
        this.f5383j = new HashSet();
        this.f5382i = new HashMap();
        this.f5384k = new Z0.c(context, interfaceC2286a, this);
        v6.f3421f.a(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f5215a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f5216c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f5215a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f5216c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // Z0.b
    public final void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                o.e().b(m, AbstractC2914a.d("Constraints unmet for WorkSpec ", str), new Throwable[0]);
                k kVar = this.f5377c;
                ((C.c) kVar.f3419d).p(new j(kVar, str, true));
            }
        }
    }

    @Override // V0.a
    public final void c(String str, boolean z8) {
        boolean z9;
        Map.Entry entry;
        synchronized (this.f5379f) {
            try {
                C2168i c2168i = (C2168i) this.f5382i.remove(str);
                if (c2168i != null) {
                    z9 = this.f5383j.remove(c2168i);
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f5384k.b(this.f5383j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f5381h.remove(str);
        if (str.equals(this.f5380g) && this.f5381h.size() > 0) {
            Iterator it = this.f5381h.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f5380g = (String) entry.getKey();
            if (this.l != null) {
                h hVar2 = (h) entry.getValue();
                InterfaceC0587b interfaceC0587b = this.l;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0587b;
                systemForegroundService.f5234c.post(new RunnableC0589d(systemForegroundService, hVar2.f5215a, hVar2.f5216c, hVar2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.l;
                systemForegroundService2.f5234c.post(new Q.a(hVar2.f5215a, 2, systemForegroundService2));
            }
        }
        InterfaceC0587b interfaceC0587b2 = this.l;
        if (hVar != null && interfaceC0587b2 != null) {
            o e4 = o.e();
            String str2 = m;
            int i9 = hVar.f5215a;
            int i10 = hVar.b;
            StringBuilder sb = new StringBuilder("Removing Notification (id: ");
            sb.append(i9);
            sb.append(", workSpecId: ");
            sb.append(str);
            sb.append(" ,notificationType: ");
            e4.b(str2, AbstractC2914a.g(sb, i10, ")"), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0587b2;
            systemForegroundService3.f5234c.post(new Q.a(hVar.f5215a, 2, systemForegroundService3));
        }
    }

    public final void e(Intent intent) {
        int i9 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o e4 = o.e();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        e4.b(m, AbstractC2914a.g(sb, intExtra2, ")"), new Throwable[0]);
        if (notification != null && this.l != null) {
            h hVar = new h(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.f5381h;
            linkedHashMap.put(stringExtra, hVar);
            if (TextUtils.isEmpty(this.f5380g)) {
                this.f5380g = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.l;
                systemForegroundService.f5234c.post(new RunnableC0589d(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.l;
            systemForegroundService2.f5234c.post(new B3.b(systemForegroundService2, intExtra, notification, 2));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i9 |= ((h) ((Map.Entry) it.next()).getValue()).b;
                }
                h hVar2 = (h) linkedHashMap.get(this.f5380g);
                if (hVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.l;
                    systemForegroundService3.f5234c.post(new RunnableC0589d(systemForegroundService3, hVar2.f5215a, hVar2.f5216c, i9));
                }
            }
        }
    }

    public final void g() {
        this.l = null;
        synchronized (this.f5379f) {
            this.f5384k.c();
        }
        this.f5377c.f3421f.e(this);
    }

    @Override // Z0.b
    public final void f(List list) {
    }
}
