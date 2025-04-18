package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class MaxEvents extends ArrayList<MaxEvent> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29821a = "MaxEvents";

    /* renamed from: b, reason: collision with root package name */
    private int f29822b;

    private MaxEvents() {
        this.f29822b = 10;
    }

    public MaxEvents(int capacity) {
        this.f29822b = 10;
        this.f29822b = capacity;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(MaxEvent maxEvent) {
        if (size() >= this.f29822b) {
            remove(0);
        }
        return super.add(maxEvent);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i2, MaxEvent maxEvent) {
        super.add(i2, maxEvent);
    }

    public ArrayList<Bundle> a() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        Logger.d(f29821a, "MaxEvents toBundle : " + arrayList.toString());
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString() + ",");
        }
        return sb.toString();
    }
}
