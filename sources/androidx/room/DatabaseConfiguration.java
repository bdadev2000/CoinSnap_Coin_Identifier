package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class DatabaseConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21249a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21250b;

    /* renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.Factory f21251c;
    public final RoomDatabase.MigrationContainer d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21252f;

    /* renamed from: g, reason: collision with root package name */
    public final RoomDatabase.JournalMode f21253g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f21254h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f21255i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f21256j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21257k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21258l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f21259m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable f21260n;

    /* renamed from: o, reason: collision with root package name */
    public final RoomDatabase.PrepackagedDatabaseCallback f21261o;

    /* renamed from: p, reason: collision with root package name */
    public final List f21262p;

    /* renamed from: q, reason: collision with root package name */
    public final List f21263q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21264r;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, ArrayList arrayList, boolean z2, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z3, boolean z4, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        p0.a.s(context, "context");
        p0.a.s(migrationContainer, "migrationContainer");
        p0.a.s(arrayList2, "typeConverters");
        p0.a.s(arrayList3, "autoMigrationSpecs");
        this.f21249a = context;
        this.f21250b = str;
        this.f21251c = factory;
        this.d = migrationContainer;
        this.e = arrayList;
        this.f21252f = z2;
        this.f21253g = journalMode;
        this.f21254h = executor;
        this.f21255i = executor2;
        this.f21256j = null;
        this.f21257k = z3;
        this.f21258l = z4;
        this.f21259m = linkedHashSet;
        this.f21261o = null;
        this.f21262p = arrayList2;
        this.f21263q = arrayList3;
        this.f21264r = false;
    }

    public final boolean a(int i2, int i3) {
        if ((i2 > i3 && this.f21258l) || !this.f21257k) {
            return false;
        }
        Set set = this.f21259m;
        return set == null || !set.contains(Integer.valueOf(i2));
    }
}
