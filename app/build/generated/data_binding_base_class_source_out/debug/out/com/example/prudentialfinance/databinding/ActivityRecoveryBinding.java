// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRecoveryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnRecoverySend;

  @NonNull
  public final EditText emailRecovery;

  private ActivityRecoveryBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton btnRecoverySend, @NonNull EditText emailRecovery) {
    this.rootView = rootView;
    this.btnRecoverySend = btnRecoverySend;
    this.emailRecovery = emailRecovery;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recovery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecoveryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_recovery_Send;
      AppCompatButton btnRecoverySend = ViewBindings.findChildViewById(rootView, id);
      if (btnRecoverySend == null) {
        break missingId;
      }

      id = R.id.emailRecovery;
      EditText emailRecovery = ViewBindings.findChildViewById(rootView, id);
      if (emailRecovery == null) {
        break missingId;
      }

      return new ActivityRecoveryBinding((LinearLayout) rootView, btnRecoverySend, emailRecovery);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
