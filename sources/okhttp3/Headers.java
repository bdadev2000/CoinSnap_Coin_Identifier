package okhttp3;

import d0.k;
import e0.t;
import e0.w;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class Headers implements Iterable<k>, a {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String[] namesAndValues;

    /* loaded from: classes2.dex */
    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String str) {
            p0.a.s(str, "line");
            int W0 = m.W0(str, ':', 0, false, 6);
            if (W0 != -1) {
                String substring = str.substring(0, W0);
                p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = m.y1(substring).toString();
                String substring2 = str.substring(W0 + 1);
                p0.a.r(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            p0.a.s(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str) {
            p0.a.s(str, "line");
            int W0 = m.W0(str, ':', 1, false, 4);
            if (W0 != -1) {
                String substring = str.substring(0, W0);
                p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(W0 + 1);
                p0.a.r(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                p0.a.r(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String str, @NotNull String str2) {
            p0.a.s(str, "name");
            p0.a.s(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        @Nullable
        public final String get(@NotNull String str) {
            p0.a.s(str, "name");
            int size = this.namesAndValues.size() - 2;
            int f2 = q.f(size, 0, -2);
            if (f2 > size) {
                return null;
            }
            while (!m.S0(str, this.namesAndValues.get(size), true)) {
                if (size == f2) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String str) {
            p0.a.s(str, "name");
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (m.S0(str, this.namesAndValues.get(i2), true)) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull Date date) {
            p0.a.s(str, "name");
            p0.a.s(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String str, @NotNull Instant instant) {
            p0.a.s(str, "name");
            p0.a.s(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull String str2) {
            p0.a.s(str, "name");
            p0.a.s(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull String str2) {
            p0.a.s(str, "name");
            p0.a.s(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str, @NotNull String str2) {
            p0.a.s(str, "name");
            p0.a.s(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(m.y1(str2).toString());
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull Date date) {
            p0.a.s(str, "name");
            p0.a.s(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String str, @NotNull Instant instant) {
            p0.a.s(str, "name");
            p0.a.s(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int f2 = q.f(length, 0, -2);
            if (f2 > length) {
                return null;
            }
            while (!m.S0(str, strArr[length], true)) {
                if (length == f2) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m680deprecated_of(@NotNull String... strArr) {
            p0.a.s(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final Headers of(@NotNull String... strArr) {
            p0.a.s(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    String str = strArr2[i3];
                    if (str != null) {
                        strArr2[i3] = m.y1(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int f2 = q.f(0, strArr2.length - 1, 2);
                if (f2 >= 0) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i2 == f2) {
                            break;
                        }
                        i2 += 2;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m679deprecated_of(@NotNull Map<String, String> map) {
            p0.a.s(map, "headers");
            return of(map);
        }

        @NotNull
        public final Headers of(@NotNull Map<String, String> map) {
            p0.a.s(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String obj = m.y1(key).toString();
                String obj2 = m.y1(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i2] = obj;
                strArr[i2 + 1] = obj2;
                i2 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, kotlin.jvm.internal.k kVar) {
        this(strArr);
    }

    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return Companion.of(map);
    }

    @d0.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m678deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            length += this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String str) {
        p0.a.s(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    @Nullable
    public final Date getDate(@NotNull String str) {
        p0.a.s(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String str) {
        p0.a.s(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<k> iterator() {
        int size = size();
        k[] kVarArr = new k[size];
        for (int i2 = 0; i2 < size; i2++) {
            kVarArr[i2] = new k(name(i2), value(i2));
        }
        return e.t(kVarArr);
    }

    @NotNull
    public final String name(int i2) {
        return this.namesAndValues[i2 * 2];
    }

    @NotNull
    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        p0.a.r(comparator, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        p0.a.r(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        t.u0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        p0.a.r(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = name(i2);
            Locale locale = Locale.US;
            p0.a.r(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            p0.a.r(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i2));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = name(i2);
            String value = value(i2);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String value(int i2) {
        return this.namesAndValues[(i2 * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String str) {
        p0.a.s(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (m.S0(str, name(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return w.f30218a;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        p0.a.r(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return Companion.of(strArr);
    }
}
