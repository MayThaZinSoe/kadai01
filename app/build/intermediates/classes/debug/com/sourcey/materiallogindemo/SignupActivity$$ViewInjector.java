// Generated code from Butter Knife. Do not modify!
package com.sourcey.materiallogindemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SignupActivity$$ViewInjector<T extends com.sourcey.materiallogindemo.SignupActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492966, "field 'input_password2'");
    target.input_password2 = finder.castView(view, 2131492966, "field 'input_password2'");
    view = finder.findRequiredView(source, 2131492967, "field '_passwordText'");
    target._passwordText = finder.castView(view, 2131492967, "field '_passwordText'");
    view = finder.findRequiredView(source, 2131492970, "field '_signupButton'");
    target._signupButton = finder.castView(view, 2131492970, "field '_signupButton'");
    view = finder.findRequiredView(source, 2131492971, "field '_loginLink'");
    target._loginLink = finder.castView(view, 2131492971, "field '_loginLink'");
  }

  @Override public void reset(T target) {
    target.input_password2 = null;
    target._passwordText = null;
    target._signupButton = null;
    target._loginLink = null;
  }
}
