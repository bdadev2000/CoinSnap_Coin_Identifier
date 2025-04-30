package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f10663a = new HashMap();
    private static final Map b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f10664c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f10665d = new a(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Intent intent, @Nullable Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f10666a;
        final Map b;

        /* renamed from: c, reason: collision with root package name */
        final List f10667c;

        public b(Intent intent, Map map, List list) {
            this.f10666a = intent;
            this.b = map;
            this.f10667c = list;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f10668a;
        final Receiver b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10669c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10670d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.f10668a = intentFilter;
            this.b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f10663a) {
                try {
                    ArrayList arrayList = f10664c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i9 = 0; i9 < size; i9++) {
                b bVar = bVarArr[i9];
                if (bVar != null) {
                    for (c cVar : bVar.f10667c) {
                        if (cVar != null && !cVar.f10670d) {
                            cVar.b.onReceive(bVar.f10666a, bVar.b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f10663a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> actionsIterator = intentFilter.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    Map map2 = b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (f10663a) {
            try {
                List a6 = a(intent);
                if (a6 == null) {
                    return false;
                }
                f10664c.add(new b(intent, map, a6));
                Handler handler = f10665d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<c> a6 = a(intent);
        if (a6 == null) {
            return;
        }
        for (c cVar : a6) {
            if (!cVar.f10670d) {
                cVar.b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f10663a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.f10670d = true;
                    Iterator<String> actionsIterator = cVar.f10668a.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        String next = actionsIterator.next();
                        List list2 = (List) b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).b == receiver) {
                                    cVar.f10670d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f10663a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (c cVar : list) {
                    if (!cVar.f10669c && cVar.f10668a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.f10669c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f10669c = false;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
