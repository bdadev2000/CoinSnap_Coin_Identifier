package com.cooldev.gba.emulator.gameboy.features.home.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class DBGameMetadata$sortedSystemIds$2 extends r implements a {
    public static final DBGameMetadata$sortedSystemIds$2 INSTANCE = new DBGameMetadata$sortedSystemIds$2();

    public DBGameMetadata$sortedSystemIds$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final List<String> invoke() {
        k0.a entries = SystemID.getEntries();
        ArrayList arrayList = new ArrayList(q.M(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((SystemID) it.next()).getDbname());
        }
        return u.T0(arrayList, new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$sortedSystemIds$2$invoke$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return kotlin.jvm.internal.q.c(Integer.valueOf(((String) t3).length()), Integer.valueOf(((String) t2).length()));
            }
        });
    }
}
