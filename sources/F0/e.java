package F0;

import android.database.Cursor;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1064a;
    public final Map b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1065c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1066d;

    public e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set unmodifiableSet;
        this.f1064a = str;
        this.b = Collections.unmodifiableMap(hashMap);
        this.f1065c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.f1066d = unmodifiableSet;
    }

    public static e a(I0.b bVar, String str) {
        boolean z8;
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z9;
        Cursor n2 = bVar.n("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (n2.getColumnCount() > 0) {
                int columnIndex = n2.getColumnIndex("name");
                int columnIndex2 = n2.getColumnIndex("type");
                int columnIndex3 = n2.getColumnIndex("notnull");
                int columnIndex4 = n2.getColumnIndex("pk");
                int columnIndex5 = n2.getColumnIndex("dflt_value");
                while (n2.moveToNext()) {
                    String string = n2.getString(columnIndex);
                    String string2 = n2.getString(columnIndex2);
                    if (n2.getInt(columnIndex3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hashMap.put(string, new a(n2.getInt(columnIndex4), string, string2, n2.getString(columnIndex5), z9, 2));
                }
            }
            n2.close();
            HashSet hashSet = new HashSet();
            n2 = bVar.n("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = n2.getColumnIndex("id");
                int columnIndex7 = n2.getColumnIndex("seq");
                int columnIndex8 = n2.getColumnIndex("table");
                int columnIndex9 = n2.getColumnIndex("on_delete");
                int columnIndex10 = n2.getColumnIndex("on_update");
                ArrayList b = b(n2);
                int count = n2.getCount();
                int i12 = 0;
                while (i12 < count) {
                    n2.moveToPosition(i12);
                    if (n2.getInt(columnIndex7) != 0) {
                        i9 = columnIndex6;
                        i10 = columnIndex7;
                        arrayList = b;
                        i11 = count;
                    } else {
                        int i13 = n2.getInt(columnIndex6);
                        i9 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i10 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b;
                            c cVar = (c) it.next();
                            int i14 = count;
                            if (cVar.b == i13) {
                                arrayList2.add(cVar.f1060d);
                                arrayList3.add(cVar.f1061f);
                            }
                            b = arrayList4;
                            count = i14;
                        }
                        arrayList = b;
                        i11 = count;
                        hashSet.add(new b(n2.getString(columnIndex8), n2.getString(columnIndex9), n2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i12++;
                    columnIndex6 = i9;
                    columnIndex7 = i10;
                    b = arrayList;
                    count = i11;
                }
                n2.close();
                n2 = bVar.n("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = n2.getColumnIndex("name");
                    int columnIndex12 = n2.getColumnIndex("origin");
                    int columnIndex13 = n2.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (n2.moveToNext()) {
                            if (com.mbridge.msdk.foundation.controller.a.f15376a.equals(n2.getString(columnIndex12))) {
                                String string3 = n2.getString(columnIndex11);
                                if (n2.getInt(columnIndex13) == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                d c9 = c(bVar, string3, z8);
                                if (c9 != null) {
                                    hashSet3.add(c9);
                                }
                            }
                        }
                        n2.close();
                        hashSet2 = hashSet3;
                        return new e(str, hashMap, hashSet, hashSet2);
                    }
                    return new e(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < count; i9++) {
            cursor.moveToPosition(i9);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(I0.b bVar, String str, boolean z8) {
        Cursor n2 = bVar.n("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = n2.getColumnIndex("seqno");
            int columnIndex2 = n2.getColumnIndex(BidResponsedEx.KEY_CID);
            int columnIndex3 = n2.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (n2.moveToNext()) {
                    if (n2.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(n2.getInt(columnIndex)), n2.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, arrayList, z8);
                n2.close();
                return dVar;
            }
            n2.close();
            return null;
        } catch (Throwable th) {
            n2.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f1064a;
        String str2 = this.f1064a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.b;
        Map map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f1065c;
        Set set3 = this.f1065c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f1066d;
        if (set4 == null || (set = eVar.f1066d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f1064a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i9 * 31;
        Map map = this.b;
        if (map != null) {
            i10 = map.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        Set set = this.f1065c;
        if (set != null) {
            i11 = set.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f1064a + "', columns=" + this.b + ", foreignKeys=" + this.f1065c + ", indices=" + this.f1066d + '}';
    }
}
