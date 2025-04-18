package androidx.room.util;

import android.database.Cursor;
import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import b1.f0;
import com.google.android.gms.ads.AdError;
import e0.u;
import e0.x;
import f0.c;
import f0.g;
import f0.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.q;
import p0.a;
import z0.m;

@RestrictTo
/* loaded from: classes2.dex */
public final class TableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f21413a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f21414b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21415c;
    public final Set d;

    /* loaded from: classes2.dex */
    public static final class Column {

        /* renamed from: a, reason: collision with root package name */
        public final String f21416a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21417b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21418c;
        public final int d;
        public final String e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21419f;

        /* renamed from: g, reason: collision with root package name */
        public final int f21420g;

        /* loaded from: classes2.dex */
        public static final class Companion {
            public static boolean a(String str, String str2) {
                a.s(str, "current");
                if (a.g(str, str2)) {
                    return true;
                }
                if (str.length() != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i2 < str.length()) {
                            char charAt = str.charAt(i2);
                            int i5 = i4 + 1;
                            if (i4 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt != '(') {
                                if (charAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                                    break;
                                }
                            } else {
                                i3++;
                            }
                            i2++;
                            i4 = i5;
                        } else if (i3 == 0) {
                            String substring = str.substring(1, str.length() - 1);
                            a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            return a.g(m.y1(substring).toString(), str2);
                        }
                    }
                }
                return false;
            }
        }

        public Column(int i2, String str, String str2, String str3, boolean z2, int i3) {
            this.f21416a = str;
            this.f21417b = str2;
            this.f21418c = z2;
            this.d = i2;
            this.e = str3;
            this.f21419f = i3;
            Locale locale = Locale.US;
            a.r(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            a.r(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.f21420g = m.M0(upperCase, "INT", false) ? 3 : (m.M0(upperCase, "CHAR", false) || m.M0(upperCase, "CLOB", false) || m.M0(upperCase, "TEXT", false)) ? 2 : m.M0(upperCase, "BLOB", false) ? 5 : (m.M0(upperCase, "REAL", false) || m.M0(upperCase, "FLOA", false) || m.M0(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column)) {
                return false;
            }
            Column column = (Column) obj;
            if (this.d != column.d) {
                return false;
            }
            if (!a.g(this.f21416a, column.f21416a) || this.f21418c != column.f21418c) {
                return false;
            }
            int i2 = column.f21419f;
            String str = column.e;
            String str2 = this.e;
            int i3 = this.f21419f;
            if (i3 == 1 && i2 == 2 && str2 != null && !Companion.a(str2, str)) {
                return false;
            }
            if (i3 != 2 || i2 != 1 || str == null || Companion.a(str, str2)) {
                return (i3 == 0 || i3 != i2 || (str2 == null ? str == null : Companion.a(str2, str))) && this.f21420g == column.f21420g;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f21416a.hashCode() * 31) + this.f21420g) * 31) + (this.f21418c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f21416a);
            sb.append("', type='");
            sb.append(this.f21417b);
            sb.append("', affinity='");
            sb.append(this.f21420g);
            sb.append("', notNull=");
            sb.append(this.f21418c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = AdError.UNDEFINED_DOMAIN;
            }
            return d.r(sb, str, "'}");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface CreatedFrom {
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static final class ForeignKey {

        /* renamed from: a, reason: collision with root package name */
        public final String f21421a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21422b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21423c;
        public final List d;
        public final List e;

        public ForeignKey(String str, String str2, String str3, List list, List list2) {
            a.s(list, "columnNames");
            a.s(list2, "referenceColumnNames");
            this.f21421a = str;
            this.f21422b = str2;
            this.f21423c = str3;
            this.d = list;
            this.e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (a.g(this.f21421a, foreignKey.f21421a) && a.g(this.f21422b, foreignKey.f21422b) && a.g(this.f21423c, foreignKey.f21423c) && a.g(this.d, foreignKey.d)) {
                return a.g(this.e, foreignKey.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + d.f(this.d, androidx.compose.foundation.text.input.a.b(this.f21423c, androidx.compose.foundation.text.input.a.b(this.f21422b, this.f21421a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f21421a + "', onDelete='" + this.f21422b + " +', onUpdate='" + this.f21423c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* loaded from: classes2.dex */
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final int f21424a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21425b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21426c;
        public final String d;

        public ForeignKeyWithSequence(int i2, int i3, String str, String str2) {
            this.f21424a = i2;
            this.f21425b = i3;
            this.f21426c = str;
            this.d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
            ForeignKeyWithSequence foreignKeyWithSequence2 = foreignKeyWithSequence;
            a.s(foreignKeyWithSequence2, "other");
            int i2 = this.f21424a - foreignKeyWithSequence2.f21424a;
            return i2 == 0 ? this.f21425b - foreignKeyWithSequence2.f21425b : i2;
        }
    }

    public TableInfo(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        a.s(abstractSet, "foreignKeys");
        this.f21413a = str;
        this.f21414b = map;
        this.f21415c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final TableInfo a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Map map;
        List J;
        l lVar;
        l lVar2;
        int i2;
        String str2;
        int i3;
        int i4;
        Throwable th;
        Index index;
        SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
        a.s(supportSQLiteDatabase2, "database");
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str3 = "`)";
        sb.append("`)");
        Cursor W = supportSQLiteDatabase2.W(sb.toString());
        try {
            String str4 = "name";
            if (W.getColumnCount() <= 0) {
                map = x.f30219a;
                q.b(W, null);
            } else {
                int columnIndex = W.getColumnIndex("name");
                int columnIndex2 = W.getColumnIndex("type");
                int columnIndex3 = W.getColumnIndex("notnull");
                int columnIndex4 = W.getColumnIndex("pk");
                int columnIndex5 = W.getColumnIndex("dflt_value");
                g gVar = new g();
                while (W.moveToNext()) {
                    String string = W.getString(columnIndex);
                    String string2 = W.getString(columnIndex2);
                    boolean z2 = W.getInt(columnIndex3) != 0;
                    int i5 = W.getInt(columnIndex4);
                    String string3 = W.getString(columnIndex5);
                    a.r(string, "name");
                    a.r(string2, "type");
                    gVar.put(string, new Column(i5, string, string2, string3, z2, 2));
                    columnIndex = columnIndex;
                }
                gVar.c();
                gVar.f30441n = true;
                if (gVar.f30437j > 0) {
                    map = gVar;
                } else {
                    map = g.f30429o;
                    a.q(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
                }
                q.b(W, null);
            }
            W = supportSQLiteDatabase2.W("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = W.getColumnIndex("id");
                int columnIndex7 = W.getColumnIndex("seq");
                int columnIndex8 = W.getColumnIndex("table");
                int columnIndex9 = W.getColumnIndex("on_delete");
                int columnIndex10 = W.getColumnIndex("on_update");
                int columnIndex11 = W.getColumnIndex("id");
                int columnIndex12 = W.getColumnIndex("seq");
                int columnIndex13 = W.getColumnIndex("from");
                int columnIndex14 = W.getColumnIndex("to");
                c cVar = new c();
                while (W.moveToNext()) {
                    String str5 = str4;
                    int i6 = W.getInt(columnIndex11);
                    int i7 = columnIndex11;
                    int i8 = W.getInt(columnIndex12);
                    int i9 = columnIndex12;
                    String string4 = W.getString(columnIndex13);
                    int i10 = columnIndex13;
                    a.r(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = W.getString(columnIndex14);
                    a.r(string5, "cursor.getString(toColumnIndex)");
                    cVar.add(new ForeignKeyWithSequence(i6, i8, string4, string5));
                    map = map;
                    str4 = str5;
                    columnIndex11 = i7;
                    columnIndex12 = i9;
                    columnIndex13 = i10;
                    columnIndex14 = columnIndex14;
                }
                Map map2 = map;
                String str6 = str4;
                c e = f0.e(cVar);
                a.s(e, "<this>");
                if (e.b() <= 1) {
                    J = u.Z0(e);
                } else {
                    Object[] array = e.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    J = e0.q.J(array);
                }
                W.moveToPosition(-1);
                l lVar3 = new l();
                while (W.moveToNext()) {
                    if (W.getInt(columnIndex7) == 0) {
                        int i11 = W.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : J) {
                            List list = J;
                            if (((ForeignKeyWithSequence) obj).f21424a == i11) {
                                arrayList3.add(obj);
                            }
                            J = list;
                        }
                        List list2 = J;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ForeignKeyWithSequence foreignKeyWithSequence = (ForeignKeyWithSequence) it.next();
                            arrayList.add(foreignKeyWithSequence.f21426c);
                            arrayList2.add(foreignKeyWithSequence.d);
                        }
                        String string6 = W.getString(columnIndex8);
                        a.r(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = W.getString(columnIndex9);
                        a.r(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = W.getString(columnIndex10);
                        a.r(string8, "cursor.getString(onUpdateColumnIndex)");
                        lVar3.add(new ForeignKey(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        J = list2;
                    }
                }
                l f2 = f0.f(lVar3);
                q.b(W, null);
                W = supportSQLiteDatabase2.W("PRAGMA index_list(`" + str + "`)");
                String str7 = str6;
                try {
                    int columnIndex15 = W.getColumnIndex(str7);
                    int columnIndex16 = W.getColumnIndex("origin");
                    int columnIndex17 = W.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        lVar = null;
                        q.b(W, null);
                    } else {
                        l lVar4 = new l();
                        while (W.moveToNext()) {
                            if (a.g("c", W.getString(columnIndex16))) {
                                String string9 = W.getString(columnIndex15);
                                boolean z3 = W.getInt(columnIndex17) == 1;
                                a.r(string9, str7);
                                W = supportSQLiteDatabase2.W("PRAGMA index_xinfo(`" + string9 + str3);
                                try {
                                    int columnIndex18 = W.getColumnIndex("seqno");
                                    int columnIndex19 = W.getColumnIndex("cid");
                                    int columnIndex20 = W.getColumnIndex(str7);
                                    int columnIndex21 = W.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        i2 = columnIndex15;
                                        str2 = str3;
                                        i3 = columnIndex16;
                                        i4 = columnIndex17;
                                        th = null;
                                        q.b(W, null);
                                        index = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        i2 = columnIndex15;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (W.moveToNext()) {
                                            if (W.getInt(columnIndex19) >= 0) {
                                                int i12 = W.getInt(columnIndex18);
                                                String str9 = str3;
                                                String string10 = W.getString(columnIndex20);
                                                int i13 = columnIndex21;
                                                String str10 = W.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i14 = columnIndex16;
                                                Integer valueOf = Integer.valueOf(i12);
                                                a.r(string10, "columnName");
                                                treeMap.put(valueOf, string10);
                                                treeMap2.put(Integer.valueOf(i12), str10);
                                                str3 = str9;
                                                columnIndex16 = i14;
                                                columnIndex21 = i13;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str2 = str3;
                                        i3 = columnIndex16;
                                        i4 = columnIndex17;
                                        Collection values = treeMap.values();
                                        a.r(values, "columnsMap.values");
                                        List Z0 = u.Z0(values);
                                        Collection values2 = treeMap2.values();
                                        a.r(values2, "ordersMap.values");
                                        index = new Index(string9, z3, Z0, u.Z0(values2));
                                        q.b(W, null);
                                        th = null;
                                    }
                                    if (index == null) {
                                        q.b(W, th);
                                        lVar2 = null;
                                        break;
                                    }
                                    lVar4.add(index);
                                    supportSQLiteDatabase2 = supportSQLiteDatabase;
                                    columnIndex15 = i2;
                                    str7 = str8;
                                    str3 = str2;
                                    columnIndex16 = i3;
                                    columnIndex17 = i4;
                                } finally {
                                }
                            }
                        }
                        lVar = f0.f(lVar4);
                        q.b(W, null);
                    }
                    lVar2 = lVar;
                    return new TableInfo(str, map2, f2, lVar2);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!a.g(this.f21413a, tableInfo.f21413a) || !a.g(this.f21414b, tableInfo.f21414b) || !a.g(this.f21415c, tableInfo.f21415c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = tableInfo.d) == null) {
            return true;
        }
        return a.g(set2, set);
    }

    public final int hashCode() {
        return this.f21415c.hashCode() + ((this.f21414b.hashCode() + (this.f21413a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f21413a + "', columns=" + this.f21414b + ", foreignKeys=" + this.f21415c + ", indices=" + this.d + '}';
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static final class Index {

        /* renamed from: a, reason: collision with root package name */
        public final String f21427a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21428b;

        /* renamed from: c, reason: collision with root package name */
        public final List f21429c;
        public final List d;

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(String str, boolean z2, List list, List list2) {
            a.s(list, "columns");
            a.s(list2, "orders");
            this.f21427a = str;
            this.f21428b = z2;
            this.f21429c = list;
            this.d = list2;
            List list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    list3.add("ASC");
                }
            }
            this.d = (List) list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.f21428b != index.f21428b || !a.g(this.f21429c, index.f21429c) || !a.g(this.d, index.d)) {
                return false;
            }
            String str = this.f21427a;
            boolean q1 = m.q1(str, "index_", false);
            String str2 = index.f21427a;
            return q1 ? m.q1(str2, "index_", false) : a.g(str, str2);
        }

        public final int hashCode() {
            String str = this.f21427a;
            return this.d.hashCode() + d.f(this.f21429c, (((m.q1(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f21428b ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            return "Index{name='" + this.f21427a + "', unique=" + this.f21428b + ", columns=" + this.f21429c + ", orders=" + this.d + "'}";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Index(java.lang.String r6, java.util.List r7) {
            /*
                r5 = this;
                java.lang.String r0 = "columns"
                p0.a.s(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = r2
            L10:
                if (r3 >= r0) goto L1a
                java.lang.String r4 = "ASC"
                r1.add(r4)
                int r3 = r3 + 1
                goto L10
            L1a:
                r5.<init>(r6, r2, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, java.util.List):void");
        }
    }
}
