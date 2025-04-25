package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import com.glority.android.picturexx.settings.fragment.setting.ReportFragment;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenFeedbackFragmentRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/glority/base/routers/OpenFeedbackFragmentRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", Args.title, "", "tag", "Lcom/glority/base/routers/OpenFeedbackFragmentRequest$Tag;", "<init>", "(Ljava/lang/String;Lcom/glority/base/routers/OpenFeedbackFragmentRequest$Tag;)V", "getTitle", "()Ljava/lang/String;", "getTag", "()Lcom/glority/base/routers/OpenFeedbackFragmentRequest$Tag;", "Tag", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenFeedbackFragmentRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    private final Tag tag;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenFeedbackFragmentRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/glority/base/routers/OpenFeedbackFragmentRequest$Tag;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ISSUES", "SUGGESTION", "REPORT", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Tag {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tag[] $VALUES;
        private final String type;
        public static final Tag ISSUES = new Tag("ISSUES", 0, "issues");
        public static final Tag SUGGESTION = new Tag("SUGGESTION", 1, "suggestion");
        public static final Tag REPORT = new Tag("REPORT", 2, ReportFragment.FEEDBACK_TAG);

        private static final /* synthetic */ Tag[] $values() {
            return new Tag[]{ISSUES, SUGGESTION, REPORT};
        }

        public static EnumEntries<Tag> getEntries() {
            return $ENTRIES;
        }

        private Tag(String str, int i, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            Tag[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Tag valueOf(String str) {
            return (Tag) Enum.valueOf(Tag.class, str);
        }

        public static Tag[] values() {
            return (Tag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFeedbackFragmentRequest(String str, Tag tag) {
        super(UrlRouter.INSTANCE.getURL_OPEN_FEEDBACK_FRAGMENT(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.title = str;
        this.tag = tag;
    }

    public /* synthetic */ OpenFeedbackFragmentRequest(String str, Tag tag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Tag.SUGGESTION : tag);
    }

    public final Tag getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }
}
