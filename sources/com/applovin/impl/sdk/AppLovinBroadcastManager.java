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
    private static final Map a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f7525b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f7526c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f7527d = new a(Looper.getMainLooper());

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
        final Intent a;

        /* renamed from: b, reason: collision with root package name */
        final Map f7528b;

        /* renamed from: c, reason: collision with root package name */
        final List f7529c;

        public b(Intent intent, Map map, List list) {
            this.a = intent;
            this.f7528b = map;
            this.f7529c = list;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        final IntentFilter a;

        /* renamed from: b, reason: collision with root package name */
        final Receiver f7530b;

        /* renamed from: c, reason: collision with root package name */
        boolean f7531c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7532d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.a = intentFilter;
            this.f7530b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (a) {
                ArrayList arrayList = f7526c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                arrayList.toArray(bVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f7529c) {
                        if (cVar != null && !cVar.f7532d) {
                            cVar.f7530b.onReceive(bVar.a, bVar.f7528b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = a;
        synchronized (map) {
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
                Map map2 = f7525b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (a) {
            List a10 = a(intent);
            if (a10 == null) {
                return false;
            }
            f7526c.add(new b(intent, map, a10));
            Handler handler = f7527d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<c> a10 = a(intent);
        if (a10 == null) {
            return;
        }
        for (c cVar : a10) {
            if (!cVar.f7532d) {
                cVar.f7530b.onReceive(intent, map);
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
        Map map = a;
        synchronized (map) {
            List<c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (c cVar : list) {
                cVar.f7532d = true;
                Iterator<String> actionsIterator = cVar.a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    List list2 = (List) f7525b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((c) it.next()).f7530b == receiver) {
                                cVar.f7532d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f7525b.remove(next);
                        }
                    }
                }
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<c> list = (List) f7525b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = null;
            for (c cVar : list) {
                if (!cVar.f7531c && cVar.a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar);
                    cVar.f7531c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).f7531c = false;
            }
            return arrayList;
        }
    }
}
