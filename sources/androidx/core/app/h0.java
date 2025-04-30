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
public final class h0 implements Handler.Callback, ServiceConnection {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4407c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4408d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Set f4409f = new HashSet();

    public h0(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f4407c = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(g0 g0Var) {
        boolean z8;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = g0Var.f4397a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + g0Var.f4399d.size() + " queued tasks");
        }
        if (g0Var.f4399d.isEmpty()) {
            return;
        }
        if (g0Var.b) {
            z8 = true;
        } else {
            Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
            Context context = this.b;
            boolean bindService = context.bindService(component, this, 33);
            g0Var.b = bindService;
            if (bindService) {
                g0Var.f4400e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z8 = g0Var.b;
        }
        if (z8 && g0Var.f4398c != null) {
            while (true) {
                arrayDeque = g0Var.f4399d;
                i0 i0Var = (i0) arrayDeque.peek();
                if (i0Var == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + i0Var);
                    }
                    ((e0) i0Var).a(g0Var.f4398c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e4) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e4);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(g0Var);
                return;
            }
            return;
        }
        b(g0Var);
    }

    public final void b(g0 g0Var) {
        Handler handler = this.f4407c;
        ComponentName componentName = g0Var.f4397a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i9 = g0Var.f4400e;
        int i10 = i9 + 1;
        g0Var.f4400e = i10;
        if (i10 > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = g0Var.f4399d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(g0Var.f4400e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i9) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [d.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        HashMap hashMap = this.f4408d;
        d.c cVar = null;
        Context context = this.b;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return false;
                    }
                    g0 g0Var = (g0) hashMap.get((ComponentName) message.obj);
                    if (g0Var != null) {
                        a(g0Var);
                    }
                    return true;
                }
                g0 g0Var2 = (g0) hashMap.get((ComponentName) message.obj);
                if (g0Var2 != null) {
                    if (g0Var2.b) {
                        context.unbindService(this);
                        g0Var2.b = false;
                    }
                    g0Var2.f4398c = null;
                }
                return true;
            }
            f0 f0Var = (f0) message.obj;
            g0 g0Var3 = (g0) hashMap.get(f0Var.f4391a);
            if (g0Var3 != null) {
                int i10 = d.b.b;
                IBinder iBinder = f0Var.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(d.c.f19778d8);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof d.c)) {
                        cVar = (d.c) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.b = iBinder;
                        cVar = obj;
                    }
                }
                g0Var3.f4398c = cVar;
                g0Var3.f4400e = 0;
                a(g0Var3);
            }
            return true;
        }
        i0 i0Var = (i0) message.obj;
        Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
        if (!enabledListenerPackages.equals(this.f4409f)) {
            this.f4409f = enabledListenerPackages;
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
                    hashMap.put(componentName2, new g0(componentName2));
                }
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    g0 g0Var4 = (g0) entry.getValue();
                    if (g0Var4.b) {
                        context.unbindService(this);
                        g0Var4.b = false;
                    }
                    g0Var4.f4398c = null;
                    it2.remove();
                }
            }
        }
        for (g0 g0Var5 : hashMap.values()) {
            g0Var5.f4399d.add(i0Var);
            a(g0Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f4407c.obtainMessage(1, new f0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f4407c.obtainMessage(2, componentName).sendToTarget();
    }
}
