package u0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.facebook.internal.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import r4.c;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f23060f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C2747b f23061g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23062a;
    public final HashMap b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23063c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23064d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final C f23065e;

    public C2747b(Context context) {
        this.f23062a = context;
        this.f23065e = new C(this, context.getMainLooper());
    }

    public static C2747b a(Context context) {
        C2747b c2747b;
        synchronized (f23060f) {
            try {
                if (f23061g == null) {
                    f23061g = new C2747b(context.getApplicationContext());
                }
                c2747b = f23061g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2747b;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                C2746a c2746a = new C2746a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c2746a);
                for (int i9 = 0; i9 < intentFilter.countActions(); i9++) {
                    String action = intentFilter.getAction(i9);
                    ArrayList arrayList2 = (ArrayList) this.f23063c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f23063c.put(action, arrayList2);
                    }
                    arrayList2.add(c2746a);
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
        boolean z8;
        ArrayList arrayList;
        int i9;
        String str;
        ?? r12;
        String str2;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f23062a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                int i10 = 1;
                boolean z9 = false;
                if ((intent.getFlags() & 8) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f23063c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z8) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        C2746a c2746a = (C2746a) arrayList2.get(i11);
                        if (z8) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c2746a.f23057a);
                        }
                        if (c2746a.f23058c) {
                            if (z8) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i9 = i11;
                            str = action;
                            r12 = i10;
                        } else {
                            String str3 = action;
                            arrayList = arrayList2;
                            i9 = i11;
                            str = action;
                            r12 = i10;
                            int match = c2746a.f23057a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z8) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c2746a);
                                c2746a.f23058c = r12;
                            } else if (z8) {
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
                        i11 = i9 + 1;
                        i10 = r12;
                        arrayList2 = arrayList;
                        action = str;
                        z9 = false;
                    }
                    int i12 = i10;
                    if (arrayList3 != null) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            ((C2746a) arrayList3.get(i13)).f23058c = false;
                        }
                        this.f23064d.add(new c(intent, arrayList3));
                        if (!this.f23065e.hasMessages(i12)) {
                            this.f23065e.sendEmptyMessage(i12);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C2746a c2746a = (C2746a) arrayList.get(size);
                    c2746a.f23059d = true;
                    for (int i9 = 0; i9 < c2746a.f23057a.countActions(); i9++) {
                        String action = c2746a.f23057a.getAction(i9);
                        ArrayList arrayList2 = (ArrayList) this.f23063c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C2746a c2746a2 = (C2746a) arrayList2.get(size2);
                                if (c2746a2.b == broadcastReceiver) {
                                    c2746a2.f23059d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f23063c.remove(action);
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
