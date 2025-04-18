package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxSegmentCollectionImpl implements MaxSegmentCollection {

    /* renamed from: a, reason: collision with root package name */
    private final List f25280a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25281b;

    /* loaded from: classes.dex */
    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f25282a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f25282a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f25281b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f25280a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f25280a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f25282a;
        this.f25280a = list;
        this.f25281b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f25281b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
