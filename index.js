import React from 'react';
import { NativeModules } from 'react-native';

export default class Obscure extends React.Component {
  static isObscureActive = false;

  static activateObscure() {
    if (!Obscure.isObscureActive) {
      NativeModules.Obscure.activateObscure();
      Obscure.isObscureActive = true;
    }
  }

  static deactivateObscure() {
    if (Obscure.isObscureActive) {
      NativeModules.Obscure.deactivateObscure();
      Obscure.isObscureActive = false;
    }
  }

  componentWillMount() {
    Obscure.activateObscure();
  }

  componentWillUnmount() {
    Obscure.deactivateObscure();
  }

  render() {
    return this.props.children || null;
  }
}