package m1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import d3.g;
import h.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f21426f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static b f21427g;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21428b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21429c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21430d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final f f21431e;

    public b(Context context) {
        this.a = context;
        this.f21431e = new f(this, context.getMainLooper(), 1);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f21426f) {
            if (f21427g == null) {
                f21427g = new b(context.getApplicationContext());
            }
            bVar = f21427g;
        }
        return bVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f21428b) {
            a aVar = new a(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f21428b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f21428b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(aVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList arrayList2 = (ArrayList) this.f21429c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f21429c.put(action, arrayList2);
                }
                arrayList2.add(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void c(Intent intent) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        String str;
        ?? r12;
        String str2;
        synchronized (this.f21428b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i11 = 1;
            boolean z11 = false;
            if ((intent.getFlags() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList2 = (ArrayList) this.f21429c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    a aVar = (a) arrayList2.get(i12);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + aVar.a);
                    }
                    if (aVar.f21424c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i10 = i12;
                        str = action;
                        r12 = i11;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i10 = i12;
                        str = action;
                        r12 = i11;
                        int match = aVar.a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(aVar);
                            aVar.f21424c = r12;
                        } else if (z10) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str2 = "unknown reason";
                                        } else {
                                            str2 = "type";
                                        }
                                    } else {
                                        str2 = DataSchemeDataSource.SCHEME_DATA;
                                    }
                                } else {
                                    str2 = "action";
                                }
                            } else {
                                str2 = "category";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i12 = i10 + 1;
                    i11 = r12;
                    arrayList2 = arrayList;
                    action = str;
                    z11 = false;
                }
                int i13 = i11;
                if (arrayList3 != null) {
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        ((a) arrayList3.get(i14)).f21424c = false;
                    }
                    this.f21430d.add(new g(7, intent, arrayList3));
                    if (!this.f21431e.hasMessages(i13)) {
                        this.f21431e.sendEmptyMessage(i13);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f21428b) {
            ArrayList arrayList = (ArrayList) this.f21428b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                aVar.f21425d = true;
                for (int i10 = 0; i10 < aVar.a.countActions(); i10++) {
                    String action = aVar.a.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f21429c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            a aVar2 = (a) arrayList2.get(size2);
                            if (aVar2.f21423b == broadcastReceiver) {
                                aVar2.f21425d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f21429c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
