package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPremiumContentRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/glority/base/routers/GetPremiumContentRequest;", "Lcom/glority/android/core/route/RouteRequest;", "Lcom/glority/base/routers/GetPremiumContentRequest$PremiumContent;", "<init>", "()V", "PremiumContent", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class GetPremiumContentRequest extends RouteRequest<PremiumContent> {
    public static final int $stable = 0;

    /* compiled from: GetPremiumContentRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003JK\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/glority/base/routers/GetPremiumContentRequest$PremiumContent;", "", "vipIcon", "", "", "unVipIcon", Args.title, "", "desc", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getVipIcon", "()Ljava/util/List;", "getUnVipIcon", "getTitle", "getDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final /* data */ class PremiumContent {
        public static final int $stable = 8;
        private final List<String> desc;
        private final List<String> title;
        private final List<Integer> unVipIcon;
        private final List<Integer> vipIcon;

        public final List<Integer> component1() {
            return this.vipIcon;
        }

        public final List<Integer> component2() {
            return this.unVipIcon;
        }

        public final List<String> component3() {
            return this.title;
        }

        public final List<String> component4() {
            return this.desc;
        }

        public final PremiumContent copy(List<Integer> vipIcon, List<Integer> unVipIcon, List<String> title, List<String> desc) {
            Intrinsics.checkNotNullParameter(vipIcon, "vipIcon");
            Intrinsics.checkNotNullParameter(unVipIcon, "unVipIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new PremiumContent(vipIcon, unVipIcon, title, desc);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PremiumContent)) {
                return false;
            }
            PremiumContent premiumContent = (PremiumContent) other;
            return Intrinsics.areEqual(this.vipIcon, premiumContent.vipIcon) && Intrinsics.areEqual(this.unVipIcon, premiumContent.unVipIcon) && Intrinsics.areEqual(this.title, premiumContent.title) && Intrinsics.areEqual(this.desc, premiumContent.desc);
        }

        public int hashCode() {
            int hashCode = ((((this.vipIcon.hashCode() * 31) + this.unVipIcon.hashCode()) * 31) + this.title.hashCode()) * 31;
            List<String> list = this.desc;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "PremiumContent(vipIcon=" + this.vipIcon + ", unVipIcon=" + this.unVipIcon + ", title=" + this.title + ", desc=" + this.desc + ")";
        }

        public PremiumContent(List<Integer> vipIcon, List<Integer> unVipIcon, List<String> title, List<String> list) {
            Intrinsics.checkNotNullParameter(vipIcon, "vipIcon");
            Intrinsics.checkNotNullParameter(unVipIcon, "unVipIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.vipIcon = vipIcon;
            this.unVipIcon = unVipIcon;
            this.title = title;
            this.desc = list;
        }

        public /* synthetic */ PremiumContent(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, list3, (i & 8) != 0 ? null : list4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PremiumContent copy$default(PremiumContent premiumContent, List list, List list2, List list3, List list4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = premiumContent.vipIcon;
            }
            if ((i & 2) != 0) {
                list2 = premiumContent.unVipIcon;
            }
            if ((i & 4) != 0) {
                list3 = premiumContent.title;
            }
            if ((i & 8) != 0) {
                list4 = premiumContent.desc;
            }
            return premiumContent.copy(list, list2, list3, list4);
        }

        public final List<Integer> getVipIcon() {
            return this.vipIcon;
        }

        public final List<Integer> getUnVipIcon() {
            return this.unVipIcon;
        }

        public final List<String> getTitle() {
            return this.title;
        }

        public final List<String> getDesc() {
            return this.desc;
        }
    }

    public GetPremiumContentRequest() {
        super(UrlRouter.INSTANCE.getURL_SETTING_VIP_CONTENT(), null, null, 6, null);
    }
}
