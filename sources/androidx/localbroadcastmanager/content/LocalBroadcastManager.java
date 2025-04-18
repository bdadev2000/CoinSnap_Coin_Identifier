package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class LocalBroadcastManager {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f20272f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static LocalBroadcastManager f20273g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20274a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20275b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20276c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    /* loaded from: classes3.dex */
    public static final class BroadcastRecord {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f20278a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f20279b;

        public BroadcastRecord(Intent intent, ArrayList arrayList) {
            this.f20278a = intent;
            this.f20279b = arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ReceiverRecord {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f20280a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f20281b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20282c;
        public boolean d;

        public ReceiverRecord(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f20280a = intentFilter;
            this.f20281b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f20281b);
            sb.append(" filter=");
            sb.append(this.f20280a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f20274a = context;
        this.e = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                BroadcastRecord[] broadcastRecordArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.this;
                while (true) {
                    synchronized (localBroadcastManager.f20275b) {
                        try {
                            size = localBroadcastManager.d.size();
                            if (size <= 0) {
                                return;
                            }
                            broadcastRecordArr = new BroadcastRecord[size];
                            localBroadcastManager.d.toArray(broadcastRecordArr);
                            localBroadcastManager.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        BroadcastRecord broadcastRecord = broadcastRecordArr[i2];
                        int size2 = broadcastRecord.f20279b.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ReceiverRecord receiverRecord = (ReceiverRecord) broadcastRecord.f20279b.get(i3);
                            if (!receiverRecord.d) {
                                receiverRecord.f20281b.onReceive(localBroadcastManager.f20274a, broadcastRecord.f20278a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static LocalBroadcastManager a(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f20272f) {
            try {
                if (f20273g == null) {
                    f20273g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = f20273g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f20275b) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f20275b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f20275b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(receiverRecord);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f20276c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f20276c.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void c(Intent intent) {
        ArrayList arrayList;
        int i2;
        String str;
        ?? r12;
        synchronized (this.f20275b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f20274a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                int i3 = 1;
                boolean z2 = false;
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f20276c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z3) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i4 = 0;
                    while (i4 < arrayList2.size()) {
                        ReceiverRecord receiverRecord = (ReceiverRecord) arrayList2.get(i4);
                        if (z3) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.f20280a);
                        }
                        if (receiverRecord.f20282c) {
                            if (z3) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i2 = i4;
                            str = action;
                            r12 = i3;
                        } else {
                            String str2 = action;
                            arrayList = arrayList2;
                            i2 = i4;
                            str = action;
                            r12 = i3;
                            int match = receiverRecord.f20280a.match(str2, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z3) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(receiverRecord);
                                receiverRecord.f20282c = r12;
                            } else if (z3) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        i4 = i2 + 1;
                        i3 = r12;
                        arrayList2 = arrayList;
                        action = str;
                        z2 = false;
                    }
                    int i5 = i3;
                    if (arrayList3 != null) {
                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                            ((ReceiverRecord) arrayList3.get(i6)).f20282c = false;
                        }
                        this.d.add(new BroadcastRecord(intent, arrayList3));
                        if (!this.e.hasMessages(i5)) {
                            this.e.sendEmptyMessage(i5);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f20275b) {
            try {
                ArrayList arrayList = (ArrayList) this.f20275b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(size);
                    receiverRecord.d = true;
                    for (int i2 = 0; i2 < receiverRecord.f20280a.countActions(); i2++) {
                        String action = receiverRecord.f20280a.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f20276c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ReceiverRecord receiverRecord2 = (ReceiverRecord) arrayList2.get(size2);
                                if (receiverRecord2.f20281b == broadcastReceiver) {
                                    receiverRecord2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f20276c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
