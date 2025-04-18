package ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class h {
    public final SharedPreferences a;

    public h(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j3 = this.a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.a.edit();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String d10 = d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(d10)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d10);
                    i10++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i10);
        }
        edit.commit();
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.a.edit().putLong("fire-global", currentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized String d(long j3) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j3).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        String e2 = e(str);
        if (e2 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(e2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.a.edit().remove(e2).commit();
        } else {
            this.a.edit().putStringSet(e2, hashSet).commit();
        }
    }

    public final synchronized boolean g(long j3) {
        if (this.a.contains("fire-global")) {
            long j10 = this.a.getLong("fire-global", -1L);
            synchronized (this) {
                if (!d(j10).equals(d(j3))) {
                    this.a.edit().putLong("fire-global", j3).commit();
                    return true;
                }
                return false;
            }
        }
        this.a.edit().putLong("fire-global", j3).commit();
        return true;
    }

    public final synchronized void h(long j3, String str) {
        String d10 = d(j3);
        if (this.a.getString("last-used-date", "").equals(d10)) {
            String e2 = e(d10);
            if (e2 == null) {
                return;
            }
            if (e2.equals(str)) {
                return;
            }
            i(str, d10);
            return;
        }
        long j10 = this.a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", d10).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }
}
