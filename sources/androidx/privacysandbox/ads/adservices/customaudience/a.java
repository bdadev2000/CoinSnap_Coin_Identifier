package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.List;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* bridge */ /* synthetic */ int a(Topic topic) {
        return topic.getTopicId();
    }

    public static /* bridge */ /* synthetic */ long b(Topic topic) {
        return topic.getTaxonomyVersion();
    }

    public static /* synthetic */ DeletionRequest.Builder c() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager f(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder g() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder i(GetTopicsRequest.Builder builder, boolean z2) {
        return builder.setShouldRecordObservation(z2);
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest j(GetTopicsRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse k(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic l(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager m(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ List o(GetTopicsResponse getTopicsResponse) {
        return getTopicsResponse.getTopics();
    }

    public static /* synthetic */ void p() {
        new JoinCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ long v(Topic topic) {
        return topic.getModelVersion();
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void y() {
    }
}
