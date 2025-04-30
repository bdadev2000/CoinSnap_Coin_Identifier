package P5;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public enum a {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    /* JADX INFO: Fake field, exist only in values array */
    INVITATION_ACCEPTED("invitationAccept");

    public final String b;

    a(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
