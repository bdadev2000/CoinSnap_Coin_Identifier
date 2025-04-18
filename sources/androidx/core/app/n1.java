package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n1 implements Handler.Callback, ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1214b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1215c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1216d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Set f1217f = new HashSet();

    public n1(Context context) {
        this.f1214b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f1215c = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(m1 m1Var) {
        boolean z10;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = m1Var.a;
        ArrayDeque arrayDeque = m1Var.f1212d;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (m1Var.f1210b) {
            z10 = true;
        } else {
            Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
            Context context = this.f1214b;
            boolean bindService = context.bindService(component, this, 33);
            m1Var.f1210b = bindService;
            if (bindService) {
                m1Var.f1213e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = m1Var.f1210b;
        }
        if (z10 && m1Var.f1211c != null) {
            while (true) {
                o1 o1Var = (o1) arrayDeque.peek();
                if (o1Var == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + o1Var);
                    }
                    ((k1) o1Var).a(m1Var.f1211c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(m1Var);
                return;
            }
            return;
        }
        b(m1Var);
    }

    public final void b(m1 m1Var) {
        Handler handler = this.f1215c;
        ComponentName componentName = m1Var.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = m1Var.f1213e + 1;
        m1Var.f1213e = i10;
        if (i10 > 6) {
            StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = m1Var.f1212d;
            sb2.append(arrayDeque.size());
            sb2.append(" tasks to ");
            sb2.append(componentName);
            sb2.append(" after ");
            sb2.append(m1Var.f1213e);
            sb2.append(" retries");
            Log.w("NotifManCompat", sb2.toString());
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << (i10 - 1)) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        HashMap hashMap = this.f1216d;
        c.c cVar = null;
        Context context = this.f1214b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    m1 m1Var = (m1) hashMap.get((ComponentName) message.obj);
                    if (m1Var != null) {
                        a(m1Var);
                    }
                    return true;
                }
                m1 m1Var2 = (m1) hashMap.get((ComponentName) message.obj);
                if (m1Var2 != null) {
                    if (m1Var2.f1210b) {
                        context.unbindService(this);
                        m1Var2.f1210b = false;
                    }
                    m1Var2.f1211c = null;
                }
                return true;
            }
            l1 l1Var = (l1) message.obj;
            m1 m1Var3 = (m1) hashMap.get(l1Var.a);
            if (m1Var3 != null) {
                int i11 = c.b.f2515b;
                IBinder iBinder = l1Var.f1208b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.X7);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.c)) {
                        cVar = (c.c) queryLocalInterface;
                    } else {
                        cVar = new c.a(iBinder);
                    }
                }
                m1Var3.f1211c = cVar;
                m1Var3.f1213e = 0;
                a(m1Var3);
            }
            return true;
        }
        o1 o1Var = (o1) message.obj;
        Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
        if (!enabledListenerPackages.equals(this.f1217f)) {
            this.f1217f = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ComponentName componentName2 = (ComponentName) it.next();
                if (!hashMap.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    hashMap.put(componentName2, new m1(componentName2));
                }
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    m1 m1Var4 = (m1) entry.getValue();
                    if (m1Var4.f1210b) {
                        context.unbindService(this);
                        m1Var4.f1210b = false;
                    }
                    m1Var4.f1211c = null;
                    it2.remove();
                }
            }
        }
        for (m1 m1Var5 : hashMap.values()) {
            m1Var5.f1212d.add(o1Var);
            a(m1Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f1215c.obtainMessage(1, new l1(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f1215c.obtainMessage(2, componentName).sendToTarget();
    }
}
