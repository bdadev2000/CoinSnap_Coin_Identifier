package L4;

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

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1815a;

    public i(Context context, String str) {
        this.f1815a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j7 = this.f1815a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f1815a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f1815a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f1815a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f1815a.edit();
            int i9 = 0;
            for (Map.Entry<String, ?> entry : this.f1815a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d2 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i9++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i9 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i9);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f1815a.getAll().entrySet()) {
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
                this.f1815a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j7) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j7).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f1815a.getAll().entrySet()) {
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
        try {
            String e4 = e(str);
            if (e4 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f1815a.getStringSet(e4, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f1815a.edit().remove(e4).commit();
            } else {
                this.f1815a.edit().putStringSet(e4, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j7) {
        if (this.f1815a.contains("fire-global")) {
            long j9 = this.f1815a.getLong("fire-global", -1L);
            synchronized (this) {
                if (!d(j9).equals(d(j7))) {
                    this.f1815a.edit().putLong("fire-global", j7).commit();
                    return true;
                }
                return false;
            }
        }
        this.f1815a.edit().putLong("fire-global", j7).commit();
        return true;
    }

    public final synchronized void h(long j7, String str) {
        String d2 = d(j7);
        if (this.f1815a.getString("last-used-date", "").equals(d2)) {
            String e4 = e(d2);
            if (e4 == null) {
                return;
            }
            if (e4.equals(str)) {
                return;
            }
            i(str, d2);
            return;
        }
        long j9 = this.f1815a.getLong("fire-count", 0L);
        if (j9 + 1 == 30) {
            a();
            j9 = this.f1815a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f1815a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.f1815a.edit().putStringSet(str, hashSet).putLong("fire-count", j9 + 1).putString("last-used-date", d2).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f1815a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f1815a.edit().putStringSet(str, hashSet).commit();
    }
}
