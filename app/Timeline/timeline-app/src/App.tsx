import * as React from 'react';

import {Color} from "@velocity/ui.color";
import {Icon} from "@velocity/ui.icon";

import {Button} from "@leaseplan/ui"

import './App.css';

class App extends React.Component {
  public render() {
    return (
      <div className="App">
        <Icon name="PDF" size="L" />

        <p className="App-intro" style={{color: Color.bloodOrange}}>
          To get started, edit <code>src/App.tsx</code> and save to reload.
        </p>

        <Button>Hi</Button>
      </div>
    );
  }
}

export default App;
