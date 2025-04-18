package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.analysis.ISourceFileCoverage;

/* loaded from: classes4.dex */
public class BundleCoverageImpl extends CoverageNodeImpl implements IBundleCoverage {
    private final Collection<IPackageCoverage> packages;

    public BundleCoverageImpl(String str, Collection<IPackageCoverage> collection) {
        super(ICoverageNode.ElementType.BUNDLE, str);
        this.packages = collection;
        increment(collection);
    }

    private static <T> void addByName(Map<String, Collection<T>> map, String str, T t2) {
        Collection<T> collection = map.get(str);
        if (collection == null) {
            collection = new ArrayList<>();
            map.put(str, collection);
        }
        collection.add(t2);
    }

    private static Collection<IPackageCoverage> groupByPackage(Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        HashMap hashMap = new HashMap();
        for (IClassCoverage iClassCoverage : collection) {
            addByName(hashMap, iClassCoverage.getPackageName(), iClassCoverage);
        }
        HashMap hashMap2 = new HashMap();
        for (ISourceFileCoverage iSourceFileCoverage : collection2) {
            addByName(hashMap2, iSourceFileCoverage.getPackageName(), iSourceFileCoverage);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(hashMap.keySet());
        hashSet.addAll(hashMap2.keySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Collection collection3 = (Collection) hashMap.get(str);
            if (collection3 == null) {
                collection3 = Collections.emptyList();
            }
            Collection collection4 = (Collection) hashMap2.get(str);
            if (collection4 == null) {
                collection4 = Collections.emptyList();
            }
            arrayList.add(new PackageCoverageImpl(str, collection3, collection4));
        }
        return arrayList;
    }

    @Override // org.jacoco.core.analysis.IBundleCoverage
    public Collection<IPackageCoverage> getPackages() {
        return this.packages;
    }

    public BundleCoverageImpl(String str, Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        this(str, groupByPackage(collection, collection2));
    }
}
